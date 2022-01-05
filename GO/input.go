package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	reader := bufio.NewReader(os.Stdin)
	fmt.Println("enter tour name: ")
	name, _ := reader.ReadString('\n')
	fmt.Printf("your name is: %s", name)
}
