/*에러제거*/
/*jslint devel: true */
/* eslint-disable no-console */
/* eslint no-undef: "error" */
/* eslint-env node */

/*let fs =require('fs');

fs.open('./output.txt','r',function(err,fd){
    if(err) throw err;
    let buf=new Buffer(100);
    console.log('버퍼 타입:%s',Buffer.isBuffer(buf));
    fs.read(fd,buf,0,buf.length,null,function(err,bytesRead,buffer){
        if(err) throw err;
        let inStr=buffer.toString('utf8',0,bytesRead);
        console.log('파일에서 읽은 데이터:%s',inStr);
        console.log(err,bytesRead,buffer);
        fs.close(fd,function(){
            console.log('output.txt파일을 열고 읽기 완료');
        });
    });
});*/

let fs = require('fs');
let infile= fs.createReadStream('./output.txt', {flags: 'r'} );
let outfile= fs.createWriteStream('./output2.txt', {flags: 'w'});

infile.on('data', function(data){
    console.log('읽어들인데이터', data);
    outfile.write(data);
});

infile.on('end', function(){
    console.log('파일읽기종료.');
    outfile.end(function(){
    console.log('파일쓰기종료.');
    });
});