/*에러제거*/
/*jslint devel: true */
/* eslint-disable no-console */
/* eslint no-undef: "error" */
/* eslint-env node */

let user=[
    {name:'이정호',age:22},{name:'홍길동',age:24},{name:'소녀시대',age:20},{name:'걸스데이',age:22},
    {name:'티아라',age:23},{name:'익명1',age:25},
    {name:'익명2',age:19},{name:'익명3',age:20},
    {name:'익명4',age:21},{name:'익명5',age:26}
    ,{name:'익명6',age:27},{name:'익명7',age:28},
    {name:'익명8',age:20},{name:'익명9',age:11}
    ,{name:'익명10',age:10}
];


console.log('배열 요소의 수: %d\n',user.length);

for(let i=0;i<user.length;i++){
    console.log('배열요소#'+i+': %s',user[i].name);
}
console.log('\n',user);