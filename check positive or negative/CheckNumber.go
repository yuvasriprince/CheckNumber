package main
import "fmt"
func main () {
	var A int
    fmt.Printf("enter the number:")
	fmt.Scanf("%d",&A)
	if A<0 {
	   fmt.Printf("the value is negative")
	}else if A>0 {
	   fmt.Printf("the value is positive")
	}else  {
	   fmt.Printf("equal")
	}
}