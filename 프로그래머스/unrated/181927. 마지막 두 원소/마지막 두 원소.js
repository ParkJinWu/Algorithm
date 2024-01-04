function solution(num_list) {
    var last = num_list[num_list.length-1];
    var last2 = num_list[num_list.length-2];
    if (last > num_list[num_list.length-2]){
        num_list.push(last-last2);
    }
    else num_list.push(last*2)

    return num_list;
    //return answer;
}