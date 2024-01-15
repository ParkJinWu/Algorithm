function solution(todo_list, finished) {
    let answer = [];
    
    let tmp = finished.forEach((el,i) => {
        if (el == false)answer.push(todo_list[i]);
    });

    return answer;
}