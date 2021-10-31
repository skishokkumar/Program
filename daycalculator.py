def month(j):
    if j=="march":
        return 1
    elif j=="april":
        return 2
    elif j=="may":
        return 3
    elif j=="june":
        return 4
    elif j=="july":
        return 5
    elif j=="august":
        return 6
    elif j=="september":
        return 7
    elif j=="october":
        return 8
    elif j=="november":
        return 9
    elif j=="december":
        return 10
    elif j=="january":
        return 11
    elif j=="february":
        return 12
    else:
      return -1
def daycalc(i):
    if i==0:
        return "sunday"
    elif i ==1:
        return "monday"
    elif i ==2:
        return "tuesday"
    elif i ==3:
        return "wednesday"
    elif i ==4:
        return "thursday"
    elif i ==5:
        return "friday"
    elif i ==6:
        return "saturday"
k=int(input("Enter the date:"))
c=int(input("Enter the first two digits of the year:"))
f=int(input("Enter the last two digits of the year:"))
m=input("Enter the month in string:").casefold()
a=month(m)
if(a==11 or a==12):
    f=f-1
if(a!=-1):
    F=k+((13*a-1)//5)+f+(f//4)+(c//4)-(2*c)
    F=F%7
    if(F<0):
        F=F+7
    j=daycalc(F)
    print(j)
else:
    print("invalid month")



