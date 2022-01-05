package main

import (
	"fmt"
	"strings"
)

func main() {
	str2 := "sap"
	// var str1 = "I AM STUPID"
	str3 := "hi " + "there"
	str4 := strings.Join([]string{str3, str2}, ",")
	// fmt.Println(str1 + "\n" + str2)
	fmt.Println(str4)
}
