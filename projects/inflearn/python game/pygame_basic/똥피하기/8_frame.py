import pygame

pygame.init()# 초기화(반드시 필요)

#화면 크기 설정
screen_width =480 #가로크기
screen_height =640 #세로 크기 이렇게 하면 480*640 화면의 게임창이 나옴
screen=pygame.display.set_mode((screen_width, screen_height))

# 화면 타이틀 설정
pygame.display.set_caption("게임이름")

# FPS
clock= pygame.time.Clock()
############################################################################################## 기본적으로 꼭 설정해야하는 부분

# 1. 사용자 게임 초기화(배경 화면, 게임 이미지, 좌표,속도, 폰트 등)

running=True #게임이 진행중인가?
while running:
    dt=clock.tick(60) # 게임화면의 초당 프레임 수를 설정

    print("fps: "+str(clock.get_fps())) # 프레임 수를 출력
    
    # 2. 이벤트 처리 (키보드, 마우스 등)
    for event in pygame.event.get(): # 게임을 만들기 위해서 무조건 적어야함(어떤 이벤트가 발생하였는가?)
        if event.type == pygame.QUIT: # 창이 닫히는 에빈트가 발생했는가?
            running = False #게임 종료

    # 3. 게임 캐릭터 위치 정의
    
    # 4. 충돌 처리

    # 5. 화면에 그리기
    
    pygame.display.update()

pygame.quit()