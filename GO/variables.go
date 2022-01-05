package main

import "fmt"

func main() {
	x := 1      //int
	y := 2      //int
	z := 12.343 //float
	str := "this is a string"
	fmt.Printf("x= %d,y= %d\nz(float)= %f\n,str(string)= %s", x, y, z, str)
	fmt.Println("changing values")
	x, y = y, x
	fmt.Printf("x: %d,y: %d", x, y)
}
