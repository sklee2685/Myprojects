import pygame

pygame.init()# 초기화(반드시 필요)

#화면 크기 설정
screen_width =480 #가로크기
screen_height =640 #세로 크기 이렇게 하면 480*640 화면의 게임창이 나옴
screen=pygame.display.set_mode((screen_width, screen_height))

# 화면 타이틀 설정
pygame.display.set_caption("Lee game") # 게임이름

#배경 이미지 불러오기
background=pygame.image.load("C:/Users/sklee/Desktop/모바일/인프런/파이썬 게임만들기/pygame_basic/background.png")

# 이벤트 루프 (게임이 종료되지 않도록 해줌)
running=True #게임이 진행중인가?
while running:
    for event in pygame.event.get(): # 게임을 만들기 위해서 무조건 적어야함(어떤 이벤트가 발생하였는가?)
        if event.type == pygame.QUIT: # 창이 닫히는 에빈트가 발생했는가?
            running = False #게임 종료

    #screen.fill((0,0,255)) # png파일이 아닌 RGB색상을 이용해 배경화면 설정 RGB(0,0,255)으로 파란색이 나옴  
    screen.blit(background,(0,0)) #배경 그리기 (png파일을 사용)
    
    pygame.display.update() # 게임화면을 계속해서 업데이트 해줌
# pygame 종료
pygame.quit()