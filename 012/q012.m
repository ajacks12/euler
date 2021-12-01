% We can see that 28 is the first triangle number
% to have over five divisors.
% What is the value of the first triangle number
% to have over five hundred divisors?
% ans 76576500

t=1:2;
for n=3:1000
    t(n)=t(n-1)+t(n-2);
    t(n)
    k=1:t(n);
    divs = k(rem(t(n),k)==0);
    if length(divs)
        break
    end
end

divs
t(n)