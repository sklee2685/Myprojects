/*에러제거*/
/*jslint devel: true */
/* eslint-disable no-console */
/* eslint no-undef: "error" */
/* eslint-env node */

/*
var Per={};
Per["age"]=22;
Per["name"]='이정호';
Per.moblie='010-****-****';

console.log('이름: %s',Per.name);
console.log('나이: %d',Per.age);
console.log('전화: %s',Per["moblie"]);
console.log(Per);
*/

let per={};
per["name"]='이정호';
per["id"]=20100155;
per["school"]='남서울대학교';
per["sub"]='웹서버 및 db';
per["dev"]='지능정보통신공학과';
per.phone='010-****-****';

console.log('학교명: %s',per.school);
console.log('학과명: %s',per.dev);
console.log('과목명: %s',per.sub);
console.log('  학번: %d',per.id);
console.log('  이름: %s',per.name);
console.log('  전화: %s\n',per["phone"]);

console.log(per);
