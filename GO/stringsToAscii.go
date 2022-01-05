package main

import "fmt"

func main() {
	s := "SAP is STUPID"
	for k, v := range s {
		fmt.Printf("k : %d, v: %c == %d\n", k, v, v)
	}
}
