// function makerequset(location){
//     return new Promise( (resolve , reject) =>{
//         console.log(`making requset to loction ${location}`);
//       if(location==='google'){
//         resolve('good')
//       }
//       else
//       reject('bad');
//     });
// }
// function processrequest(response){
//     return new Promise(resolve , reject =>{
//         console.log(' processing the requset');
//         resolve('more info ${response}');
//     })}
//     makerequset('google').then((res)=>{
//         console.log('response recieved');
//         return processrequest(res);
//     }) .then(finalresponse=>{
//         console.log(finalresponse);
//     }) .catch(err=>{
//         console.log(err);
//     });

// async function dowork(){
//  try{
//     const response = await  makerequset('google');
//     console.log('response recived');
//     const processedrequest = await processrequest(responsw);
//     console.log(processedrequest); 
//  }
//  catch(err){
//     console.log(err);
//  }
// }
// dowork();

// fetch('https://jsonplaceholder.typicode.com/users').then((Response)=>{
//     console.log(Response);
// })


console.log('byemmkdls');