class XYZ implements Cloneable
{
int a;
double b;
XYZ cloneTest()
{
try
{
return (XYZ)super.clone();
}
catch(CloneNotSupportedException e)
{
System.out.println("colning not  allowed");
return this;
}
}
}