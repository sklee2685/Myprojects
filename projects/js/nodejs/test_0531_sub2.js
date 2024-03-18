/*에러제거*/
/*jslint devel: true */
/* eslint-disable no-console */
/* eslint no-undef: "error" */
/* eslint-env node */

let sub1 = {};
sub1.sub=function(a,b){
    return a-b;
}
module.exports =sub1;