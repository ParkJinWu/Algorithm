import java.util.ArrayList;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        ArrayList<String> cache = new ArrayList<>(); // 캐시 FIFO

        if (cacheSize == 0) { // 캐시 사이즈가 0인 경우 처리
            return cities.length * 5;
        }

        int runningTime = 0;

        for (int i = 0; i < cities.length; i++) {
            String city = cities[i].toUpperCase();

            if(cache.contains(city)){ // 캐시 히트
                cache.remove(city);
                cache.add(city);
                runningTime+=1;

            }else { // 캐시 미스
                if(cacheSize == cache.size()){ // 꽉 차있으면
                    //cache.removeFirst(); // remove Least Recently
                    cache.remove(0);
                }
                cache.add(city);
                runningTime += 5;
            }
        }

        return runningTime;
    }
}