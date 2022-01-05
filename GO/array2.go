package main

import "fmt"

func main() {
	var arr1 = [5]int{12, 23, 34, 45, 56}
	var arr2 = [3]int{65, 76, 87}
	for k := range arr1 {
		fmt.Println(arr1[k])
	}
	for k2 := range arr2 {
		fmt.Println(arr2[k2])
	}
}
