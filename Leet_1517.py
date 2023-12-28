import pandas as pd
import re
def is_valid_email(email):
    return'@leetcode.com' in email and bool(re.match('^[a-zA-Z][a-zA-Z0-9_.-]*@leetcode.com$', email))

def valid_emails(df: pd.DataFrame) -> pd.DataFrame:
    df_val=df['mail'].apply(is_valid_email)
    return df[df_val]
