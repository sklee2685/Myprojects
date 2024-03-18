/*에러제거*/
/*jslint devel: true */
/* eslint-disable no-console */
/* eslint no-undef: "error" */
/* eslint-env node */

let fs= require('fs');

fs.open('./output.txt','w',function(err,fd){
    if(err) throw err;
    let buf=new Buffer('안중근(安重根, 1879년 9월 2일 ~ 1910년 3월 26일)은 대한제국의 독립운동가, 항일 의병장 겸 정치 사상가이다. 세례명은 토마스[1](Thomas, 도마, 다묵(多默))이다. 본관은 순흥(順興), 고려 시대 후기의 유학자 안향의 26대손이다.[2][3]동학 농민 운동에서 아버지 안태훈(安泰勳)이 몇몇 본래의 목적을 가지지않은 동학군 부대들을 정벌하는 데 함께 참여하였고, 대한제국 말기에는 학교 설립과 교육운동과 국채보상운동을 하였으며 한때 복권 사업과 비슷한 채표회사(彩票會社) 활동을 하기도 했다.1909년 우덕순, 유동하, 조도선과 소수의 결사대를 조직하여 만주의 하얼빈 역 근처에서 초대 한국통감 이토 히로부미 등의 하차 시 암살을 준비하였다. 1909년 10월 26일 하얼빈 역에 잠입하여 역전에서 러시아군의 군례를 받는 이토 히로부미를 9시30분에 암살하여 러시아 헌병에게 붙잡혔고 1910년 3월 26일 오전 10시에 살인의 죄형으로 관동주 뤼순형무소에서 교수형으로 순국하였다.');
    
    fs.write(fd,buf,0,buf.length,null,function(err, written,buffer){
        if(err) throw err;
        console.log(err,written,buffer);
        
        fs.close(fd,function(){
            console.log('파일을 열고 데이터 쓰고 파일 닫기 완료');
        });
    });
});