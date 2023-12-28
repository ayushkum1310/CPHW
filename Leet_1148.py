import pandas as pd

def article_views(df: pd.DataFrame) -> pd.DataFrame:
    sort=df['author_id']==df['viewer_id']
    new=df[sort][['author_id']]
    new.drop_duplicates(inplace=True)
    new.sort_values(by='author_id',inplace=True,ascending=True)
    new.rename(columns={'author_id':'id'},inplace=True)
    return new
