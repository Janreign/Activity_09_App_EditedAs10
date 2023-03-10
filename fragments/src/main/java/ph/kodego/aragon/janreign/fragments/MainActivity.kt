package ph.kodego.aragon.janreign.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import ph.kodego.aragon.janreign.activity_09_app2.adapter.StudentAdapter
//import ph.kodego.aragon.janreign.activity_09_app2.adapter.StudentAdapter
import ph.kodego.aragon.janreign.fragments.databinding.ActivityMainBinding
import ph.kodego.aragon.janreign.fragments.model.Student
//import ph.kodego.aragon.janreign.fragments.model.SwipeCallback

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var studentAdapter: StudentAdapter
    private var students: ArrayList<Student> = ArrayList()
    private lateinit var itemTouchHelper: ItemTouchHelper


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()

        studentAdapter = StudentAdapter(students)
        binding.list.layoutManager = LinearLayoutManager(applicationContext)
        binding.list.layoutManager = GridLayoutManager(applicationContext, 2)
        binding.list.adapter = studentAdapter

        binding.addStudentButton.setOnClickListener{
            studentAdapter.addStudent(
                Student(
                    binding.studentFirstname.text.toString(),
                    binding.studentLastname.text.toString())
            )
        }

//        var swipeCallback = SwipeCallback (0, ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT)
//        swipeCallback.studentAdapter = studentAdapter
//        itemTouchHelper = ItemTouchHelper(swipeCallback)
//        itemTouchHelper.attachToRecyclerView(binding.list)
    }

    fun init (){
        students.add(Student("Dave","Navor"))
        students.add(Student("Victor","Yu"))
        students.add(Student("JP","Soriano"))
        students.add(Student("CJ","Tronco"))
        students.add(Student("Rene","Palma"))
        students.add(Student("Joni","James"))
        students.add(Student("Janreign","Aragon"))
        students.add(Student("John Rey","Balais"))
        students.add(Student("James Nico","Rara"))
        students.add(Student("Pat Ivee","Lee"))
        students.add(Student("Rene","Palma"))
        students.add(Student("Matthew","Mottos"))
    }
}