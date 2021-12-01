% A palindromic number reads the same both ways. The largest palindrome 
% made from the product of two 2-digit numbers is 9009 = 91 99.
% Find the largest palindrome made from the product of two 3-digit numbers
% answer = 906609

go=1;
largest = 0;

for a=999:-1:600
    if go==0
        break
    end
    for b=999:-1:600
        x=a*b;
        s=num2str(x);
        if fliplr(s)==s 
            if x>largest
                largest=x;
                go=0;
                break
            end
        end
    end
end

out=[a b largest]


