package main

import (
	"fmt"
	"time"
)

func main() {

	start := time.Now()
	i := 1
	for i < 1000000000 {
		i = i + 1
	}
	end := time.Now()

	fmt.Println(end.Sub(start))
}
