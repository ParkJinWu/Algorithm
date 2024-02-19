function solution(picture, k) {
    const answer = [];

    for (let i=0; i<picture.length; i++) {
        let line = '';
        
        for (let j=0; j<picture[i].length; j++) {
            const char = picture[i][j];

            for (let i=0; i<k; i++) {
                if (char === '.') {
                    line += '.';
                }
                if (char === 'x') {
                    line += 'x';
                }
            }
        }

        for (let i=0; i<k; i++) {
            answer.push(line);
        }
    }

    return answer;
}