#Result calculation in python
nm= str(input("enter your name"))
sch= str(input("enter your school name"))
cennm= str(input("enter your    centre name"))
cenno=str(input("enter your centre  number"))
indno=str(input("enter your index number "))
R=str(input("Enter your roll no"))
phy=int(input ("enter your physics mark"))
che=int(input("enter your chemistry mark"))
bio=int(input("enter your biology mark"))
his=int(input("Wnter your history mark"))
geo= int(input("Enter your geography mark"))
elan=int(input ("enter your language mark"))
elit=int(input("enter your literature"))
math=int(input("enter your math mark"))
comp= int(input("enter your computer mark"))
hin=int(input ("enter your hindi mark "))
supw= str(input("enter your supw grade(A,B,C,D)"))

eng= (elit+elan)/2
sst=(his+geo)/2
sci=( phy+che+bio)/3
no=[sst,sci,math,hin,comp]

def bubsort(no):
    n = len(no)
    for i in range(n-1,0,-1):
      
      for j in range(i):
        
        if no[j] > no[j + 1]:
          
          temp=no[j]
          no[j]= no[j+1]
          no[j+1]=temp
    tot =eng+no[4]+no[3]+no[2]+no[1]
    percent=tot/5
    return percent

print("ICSE Result 2023")
print("Name="+nm)
print("center number="+cenno)
print("Index number"+indno)
print("Roll no="+R)
print("school name="+sch)
print("Center name= " +cennm)
print("English="+str(eng))
print("Science="+str(sci))
print("Socal Study="+str(sst))
print("Mathematic="+str(math))
print("Computer="+str(comp))
print("Hindi="+str(hin))
per=bubsort(no)
print(str(per)+"%")
 
 
