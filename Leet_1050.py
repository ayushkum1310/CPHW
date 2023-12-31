import pandas as pd

def actors_and_directors(df: pd.DataFrame) -> pd.DataFrame:
    new=df.groupby(['actor_id', 'director_id']).size().reset_index(name='count')
    sort=new['count']>=3
    return new[sort][['actor_id','director_id']]
