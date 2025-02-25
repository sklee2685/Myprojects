import pygame

pygame.init()# 초기화(반드시 필요)

#화면 크기 설정
screen_width =480 #가로크기
screen_height =640 #세로 크기 이렇게 하면 480*640 화면의 게임창이 나옴
screen=pygame.display.set_mode((screen_width, screen_height))

# 화면 타이틀 설정
pygame.display.set_caption("Lee game") # 게임이름

# FPS
clock= pygame.time.Clock()

#배경 이미지 불러오기
background=pygame.image.load("C:/Users/sklee/Desktop/모바일/인프런/파이썬 게임만들기/pygame_basic/background.png")

# 캐릭터(스프라이트) 불러오기
character=pygame.image.load("C:/Users/sklee/Desktop/모바일/인프런/파이썬 게임만들기/pygame_basic/character.png")
character_size = character.get_rect().size #이미지 크기를 가져옴
character_width = character_size[0] # 캐릭터의 가로 크기
character_height = character_size[1] # 캐릭터의 세로 크기
character_x_pos = (screen_width / 2) - (character_width / 2) #화면 가로의 절반 크기에 해당하는 곳에 위치
character_y_pos = screen_height - character_height #화면 세로 크기 가장 아래에 해당하는 곳에 위치

# 이동할 좌표
to_x=0
to_y=0

#이동속도
character_speed=0.5

# 이벤트 루프 (게임이 종료되지 않도록 해줌)
running=True #게임이 진행중인가?
while running:
    dt=clock.tick(60) # 게임화면의 초당 프레임 수를 설정

    print("fps: "+str(clock.get_fps())) # 프레임 수를 출력

    for event in pygame.event.get(): # 게임을 만들기 위해서 무조건 적어야함(어떤 이벤트가 발생하였는가?)
        if event.type == pygame.QUIT: # 창이 닫히는 에빈트가 발생했는가?
            running = False #게임 종료

        if event.type == pygame.KEYDOWN: # 방향키가 눌렸는지 확인  
            if event.key == pygame.K_LEFT: # 캐릭터를 왼쪽으로
                to_x -=character_speed # to_x = to_x-1 랑 동일
            elif event.key == pygame.K_RIGHT: # 캐릭터를 오른쪽으로
                to_x +=character_speed
            elif event.key == pygame.K_UP: # 캐릭터를 위로
                to_y -=character_speed
            elif event.key == pygame.K_DOWN: # 캐릭터를 아래로
                to_y +=character_speed

        if event.type == pygame.KEYUP: # 방향키를 떼면 멈춤
            if event.key == pygame.K_LEFT or event.key == pygame.K_RIGHT:
                to_x = 0
            elif event.key == pygame.K_UP or event.key == pygame.K_DOWN:
                to_y = 0
    
    character_x_pos += to_x*dt #*dt를 함으로써 프레임(fps)마다 달라지는 캐릭터의 이동거리가 일정해짐
    character_y_pos += to_y*dt

    # 가로 경계값 처리
    if character_x_pos <0:
        character_x_pos = 0
    elif character_x_pos > screen_width-character_width:
        character_x_pos=screen_width-character_width
        
    # 세로 경계값 처리
    if character_y_pos <0:
        character_y_pos = 0
    elif character_y_pos > screen_height-character_height:
        character_y_pos=screen_height-character_height

    #screen.fill((0,0,255)) # png파일이 아닌 RGB색상을 이용해 배경화면 설정 RGB(0,0,255)으로 파란색이 나옴  
    screen.blit(background,(0,0)) #배경 그리기 (png파일을 사용)
    screen.blit(character,(character_x_pos,character_y_pos))
    
    pygame.display.update() # 게임화면을 계속해서 업데이트 해줌
# pygame 종료
pygame.quit()