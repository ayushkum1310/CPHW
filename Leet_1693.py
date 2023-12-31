import pandas as pd

def daily_leads_and_partners(df: pd.DataFrame) -> pd.DataFrame:
    df.rename(columns={"lead_id":"unique_leads","partner_id":"unique_partners"},inplace=True)
    return df.groupby(['date_id','make_name']).nunique().reset_index()
