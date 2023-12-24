import pandas as pd

def find_employees(employee: pd.DataFrame) -> pd.DataFrame:
    new_table = employee.merge(employee, left_on='managerId', right_on="id")
    new_table = new_table[new_table['salary_x'] > new_table['salary_y']]

    return new_table[['name_x']].rename(columns={'name_x': 'Employee'})



