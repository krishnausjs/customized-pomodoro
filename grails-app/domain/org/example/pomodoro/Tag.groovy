package org.example.pomodoro

class Tag {
	String name
	static hasMany = [task: Task]
	static belongsTo = Task
    static constraints = {
		name blank: false, unique: true
    }
	String toString() { return name }
}
