def main():
    with open("US-cities.txt", "r") as f:
        with open("US-cities-with-comma", "w") as c:
            for line in f:
                word = line.strip()
                if len(word) > 0:
                    c.write(line + "," + "\n")

main()