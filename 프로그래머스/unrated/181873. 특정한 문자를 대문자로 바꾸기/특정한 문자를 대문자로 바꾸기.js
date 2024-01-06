const solution = (my_string,alp) => my_string.split(alp).join(alp.toUpperCase());


const solution = (my_string,alp) => my_string.replaceAll(alp,alp.toUpperCase());
