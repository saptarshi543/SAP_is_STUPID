package main

import "fmt"

var x = 7

func example() {
	fmt.Printf("inside function example\nx=%d", x)
}
func main() {
	fmt.Printf("in main\n x= %d\n", x)
	example()
}
