% Find the difference between the sum 
% of the squares of the first one hundred 
% natural numbers and the square of the sum.
% answer = 25164150

sosq=0;
sqos=0;

for i=1:100
    sosq=sosq+(i.^2);
    sqos=sqos+i;
end
sqos=sqos.^2;

format long
diff=sqos-sosq
disp("answ = 25164150");