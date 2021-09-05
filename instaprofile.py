import instaloader as ins
ig=ins.Instaloader()
df=input("Enter the username:")
ig.download_profile(df,profile_pic_only=True)
