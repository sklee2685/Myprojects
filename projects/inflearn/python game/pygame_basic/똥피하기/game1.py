import pygame
import random

pygame.init()

#화면 크기 설정
screen_width =480
screen_height =640
screen=pygame.display.set_mode((screen_width, screen_height))

# 화면 타이틀 설정
pygame.display.set_caption("똥피하기")

# FPS
clock= pygame.time.Clock()


# 1. 사용자 게임 초기화(배경 화면, 게임 이미지, 좌표,속도, 폰트 등)

#배경
background=pygame.image.load("C:/Users/sklee/Desktop/모바일/인프런/파이썬 게임만들기/pygame_basic/background.png")

#캐릭터
ch= pygame.image.load("C:/Users/sklee/Desktop/모바일/인프런/파이썬 게임만들기/pygame_basic/character.png")
ch_size=ch.get_rect().size
ch_width=ch_size[0]
ch_height=ch_size[1]
ch_x_pos=(screen_width/2)-(ch_width/2)
ch_y_pos=screen_height-ch_height

#좌표
to_x=0
ch_speed=10

# 똥
ddo=pygame.image.load("C:/Users/sklee/Desktop/모바일/인프런/파이썬 게임만들기/pygame_basic/enemy.png")
ddo_size=ddo.get_rect().size
ddo_width=ddo_size[0]
ddo_height=ddo_size[1]
ddo_x_pos=random.randint(0,screen_width-ddo_width)
ddo_y_pos=0
ddo_speed=10

# 폰트 정의
game_font = pygame.font.Font(None,40) # 폰트 객체를 생성하고 (폰트, 크기)를 설정

# 게임 총 시간
total_time=10

#시간 계산
start_ticks=pygame.time.get_ticks() #시작 tick을 받아옴

running=True
while running:
    dt=clock.tick(30) # 게임화면의 초당 프레임 수를 설정

    #print("fps: "+str(clock.get_fps())) # 프레임 수를 출력
    
    # 2. 이벤트 처리 (키보드, 마우스 등)
    for event in pygame.event.get(): 
        if event.type == pygame.QUIT:
            running = False

        if event.type == pygame.KEYDOWN:
            if event.key == pygame.K_LEFT:
                to_x -=ch_speed
            elif event.key == pygame.K_RIGHT:
                to_x +=ch_speed
        
        if event.type == pygame.KEYUP:
            if event.key == pygame.K_LEFT or event.key == pygame.K_RIGHT:
                to_x=0

    # 3. 게임 캐릭터 위치 정의
    ch_x_pos +=to_x
    
    if ch_x_pos <0:
        ch_x_pos=0
    elif ch_x_pos > screen_width-ch_width:
        ch_x_pos=screen_width-ch_width

    # 똥이 떨어지면 다시 새로운 똥이 떨어짐
    ddo_y_pos += ddo_speed
    if ddo_y_pos > screen_height:
        ddo_y_pos=0
        ddo_x_pos=random.randint(0,screen_width-ddo_width)

    # 4. 충돌 처리
    ch_rect=ch.get_rect()
    ch_rect.left=ch_x_pos
    ch_rect.top=ch_y_pos

    ddo_rect=ddo.get_rect()
    ddo_rect.left=ddo_x_pos
    ddo_rect.top=ddo_y_pos

    if ch_rect.colliderect(ddo_rect):
        print("Game Over")
        running=False

    # 5. 화면에 그리기
    screen.blit(background,(0,0))
    screen.blit(ch,(ch_x_pos,ch_y_pos))
    screen.blit(ddo,(ddo_x_pos,ddo_y_pos))

    # 게임 타이머
    elapsed_time =(pygame.time.get_ticks() - start_ticks)/1000
    #경과 시간(ms)을 초(s)로 환산하기 위해 1000으로 나눔
    timer=game_font.render("Time: "+str(int(elapsed_time)),True,(255,255,255)) # 출력할 글자,True,글자생상
    screen.blit(timer,(10,10))

    # fps 게임 화면에 출력
    fps=game_font.render("FPS: "+str(int(clock.get_fps())),True,(255,255,255))
    screen.blit(fps,(365,10))

    pygame.display.update()

pygame.quit()