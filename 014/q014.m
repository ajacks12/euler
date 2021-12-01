for i=1:1000
    for n=1:1000000000
        a=i;
        if rem(a,2)==0 %even
            a=a/2;
        else
            a=3*a+1;
        end
        if a==1
            break
        end
    end
end