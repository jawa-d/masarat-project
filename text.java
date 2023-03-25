// alert('ohuihwuichuxsxi');


   let x: String

 x = 23;

 console.log(typeof x);
 // alert('ohuihwuichuxsxi');
// X =28;
//  let x = 23;
//  console.log(typeof null);
// const age = 6;
// if(age>10)
// {
//     console.log('too');
// }
// else if(age==12)
// {
//     console.log('kid');
// }
//     else
//     {
//         console.log('n');
//     }
//  const users = ['jawad ','melo','alof'];
// for (let i = 0 ; i < users.length ;i++)
// {
//     console.log(users[i]);
// }
// let number1 = 1;
// let number2 = 9;
// function addnumber(x,y)
// {
//    return  x + y
// }
//    console.log(addnumber(number1,number2));


//  const jawad= document.getElementById('hello');
 
//  function changetitle(){

    
//     jawad.style.backgroundColor="red"
    



//  }





// const makopjcp = ""
// const kljdiwn = " "




// 
// const list = document.querySelector('ul');
// const input = document.querySelector('input');
// const button = document.querySelector('button');
// button.addEventListener('click',()=>{
// const myitem = input.value;
// input.value='';
// const listitem = document.createElement('li');
// const listtext = document.createElement('span');
// const listbtn = document.createElement('button');
// listitem.appendChild(listtext)
// listtext.textContent = myitem
// listitem.appendChild(listbtn)
// listbtn.textContent='delete'
// listitem.appendChild(listitem)
// listbtn.addEventListener('click',()=>{
//     list.removeChild(listitem)
// });
// input.focus();
// });


// const userobj={
//     name:'jawad',
//     age:20,
//     phone:'07736274787',
// aggg:true,
// };


// const{ name,age,phone, ...rest } = userobj;
// console.log(userobj);
// console.log(name);

// console.log(rest);
// console.log();

//  const arr= ['njfeno','fefrf','frgg'];
// const newarr = [...arr];
// console.log(newarr);



// alert('hello');


window.addEventListener('load',()=>{
    const from = document.querySelector("#new-task-form");
    const input = document.querySelector("#new-task-input");
    const list_le = document.querySelector("#tasks");

    from.addEventListener('submit',(e)=>{
        e.preventDefault();
     const task = input.value;   
        if(!task){
            alert("please fill out the task");
            return;
        }
       const task_el =document.createElement("div");
       task_el.classList.add("task");

       const task_content_el =document.createElement("div");
       task_content_el.classList.add("content");


       task_content_el.appendChild(task_input_el);

const task_input_el=document.createElement("input");
task_input_el.classList.add("text")
task_input_el.type="text";
task_input_el.value=task;
task_input_el.setAttribute("readonly","readonly");

task_content_el.appendChild(task_input_el);
const task_action_el=document.createElement("div");
task_action_el.classList.add("action");
const task_edit_el=document.createElement("button");
task_edit_el.classList.add("edit");

const task_delete_el=document.createElement("button");
task_delete_el.innerHTML("delete");

task_action_el.appendChild(task_edit_el);
task_action_el.appendChild(task_delete_el);
task_el.appendChild(task_action_el);
list_le.appendChild(task_el);

task_edit_el.addEventListener('click',()=>{
if(task_edit_el.innerText.toLowerCase()=="edit"){
    task_input_el.removeAttribute("readonly");
task_input_el.focus();
task_edit_el.innerText="save";
}
else{
    task_input_el.setAttribute("readonly","readonly");
task_edit_el.innerText="edit";    
}

});
task_delete_el.addEventListener('click',()=>{

list_le.removeChild(task_le);



});
    })
})