% If we list all the natural numbers below 10
% that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
% The sum of these multiples is 23.
% Find the sum of all the multiples of 3 or 5 below 1000.
% answer is 233168

x=0;
for t=0:999
   if  rem(t,3)==0 || rem(t,5)==0
       x=x+t;
   end
end
x
