import pygame

pygame.init()# 초기화(반드시 필요)

#화면 크기 설정
screen_width =480 #가로크기
screen_height =640 #세로 크기 이렇게 하면 480*640 화면의 게임창이 나옴
screen=pygame.display.set_mode((screen_width, screen_height))

# 화면 타이틀 설정
pygame.display.set_caption("Lee game") # 게임이름

# 이벤트 루프 (게임이 종료되지 않도록 해줌)
running=True #게임이 진행중인가?
while running:
    for event in pygame.event.get(): # 게임을 만들기 위해서 무조건 적어야함(어떤 이벤트가 발생하였는가?)
        if event.type == pygame.QUIT: # 창이 닫히는 에빈트가 발생했는가?
            running = False #게임 종료

# pygame 종료
pygame.quit()