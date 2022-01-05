package main

import "fmt"

func main() {
	var nums = []int64{10, 20, 30, 40, 50}
	slice := nums[1:4:5]
	fmt.Println(slice)
}
