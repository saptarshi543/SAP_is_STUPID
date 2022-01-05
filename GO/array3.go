package main

import "fmt"

func main() {
	var names = [3]string{"sap", "is", "stupid"}
	for k := range names {
		fmt.Println(names[k])
	}
}
