package main

import "fmt"

func main() {
	var a string = "sap is stupid"
	var b int = 10
	var c int = 32
	ans := sum(a, b, c)
	fmt.Printf("ans= %d\n", ans)
}
func sum(a string, b, c int) int {
	fmt.Printf("a= %s\n", a)
	sum := b + c
	return sum
}
