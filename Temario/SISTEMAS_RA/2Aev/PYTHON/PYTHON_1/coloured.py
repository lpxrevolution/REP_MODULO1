def out_green(text):
    print("\033[32m {}".format(text))


def out_yellow(text):
    print("\033[33m {}".format(text))


def out_red(text):
    print("\033[37m\033[41m{}\033[0m".format(text))


out_green("OK: no errors")
out_yellow("Warning")
out_red("Error")

