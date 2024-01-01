import pandas as pd

def students_and_examinations(students: pd.DataFrame, subjects: pd.DataFrame, examinations: pd.DataFrame) -> pd.DataFrame:
    examination_count = examinations.groupby(['student_id','subject_name']).size().reset_index(name='attended_exams')

    student_doc = pd.merge(students,subjects,how='cross')

    result_df = student_doc.merge(examination_count, how='left', on=['student_id','subject_name'])\
                .sort_values(by=['student_id', 'subject_name'])
    
    result_df['attended_exams'] = result_df['attended_exams'].fillna(0)
    
    return result_df[['student_id', 'student_name', 'subject_name', 'attended_exams']] 
