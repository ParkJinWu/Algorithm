function solution(chicken) {
    let coupon = chicken ; // 현재 쿠폰 == 주문한 치킨의 수
    
    let serviceChicken = 0 ;
   
    while(coupon >= 10){
        serviceChicken += Math.floor(coupon / 10);
        coupon = Math.floor(coupon / 10) + Math.floor(coupon % 10);
        
    }
    return serviceChicken;
}