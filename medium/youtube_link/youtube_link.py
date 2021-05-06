def youtube_link(link):

	if link.find('watch?v=') == -1:
		link = link[link.find('be/')+3:]
	else:
		link = link[link.find('watch?v=')+8:]

	print(link)

link = input()

youtube_link(link)
