let courses = [
  {
    image: '../images/course1.jpeg',
    title: 'Introduction to Computer Programming',
    level: 'Level1',
    levelNumber: 1,
    code: 'CST7116',
    description:
      'Possessing the fundamentals of logic, problem-solving and programming language structure provides a solid foundation for further study.',
  },
  {
    image: '../images/course2.jpeg',
    title: 'Computer Essentials',
    level: 'Level1',
    levelNumber: 1,
    code: 'CST7118',
    description:
      'Maintaining a computer, using operating system and productivity software, and expressing related environmental and sustainability concerns.',
  },
  {
    image: '../images/course3.jpeg',
    title: 'Introduction to Database',
    level: 'Level1',
    levelNumber: 1,
    code: 'CST7215',
    description:
      'Databases are used to store data and are a core component of many information technology systems. Students learn the fundamentals.',
  },
  {
    image: '../images/course4.jpeg',
    title: 'Achieving Success in Changing Environments',
    level: 'Level1',
    levelNumber: 1,
    code: 'PRL7532',
    description:
      'Rapid changes in technology have created personal and employment choices that challenge each of us to find our place as contributing citizens.',
  },
  {
    image: '../images/course5.jpeg',
    title: 'Communications I',
    level: 'Level1',
    levelNumber: 1,
    code: 'ENL7777',
    description:
      'Communication remains an essential skill sought by employers, regardless of discipline or field of study. Using a practical, vocation-oriented approach, students focus on meeting the requirements of effective communication.',
  },
  {
    image: '../images/course6.jpeg',
    title: 'Technical Mathematics for Computer Science',
    level: 'Level1',
    levelNumber: 1,
    code: 'MAT7100',
    description:
      'The study of algebraic and transcendental functions is an essential prerequisite to Calculus. Students manipulate algebraic expressions, solve algebraic equations and linear systems, and learn the properties of and graph algebraic and transcendental functions.',
  },
  {
    image: '../images/course7.jpeg',
    title: 'Database Systems',
    level: 'Level2',
    levelNumber: 2,
    code: 'CST72355',
    description:
      'Database systems can automate data processing tasks as well as tie into the security of information technology systems. Students acquire practical knowledge.',
  },
  {
    image: '../images/course8.jpeg',
    title: 'Operating System Fundamentals (GNU/Linux)',
    level: 'Level2',
    levelNumber: 2,
    code: 'CST7102',
    description:
      'Operating systems form the backbone of information technology systems coordinating the interaction between hardware and software.',
  },
  {
    image: '../images/course9.jpeg',
    title: 'Object Oriented Programming (Java)',
    level: 'Level2',
    levelNumber: 2,
    code: 'CST7284',
    description:
      'Working in the field of information technology as a programmer requires a firm understanding of Object-Oriented Programming (OOP) concepts.',
  },
  {
    image: '../images/course10.jpeg',
    title: 'Web Programming',
    level: 'Level2',
    levelNumber: 2,
    code: 'CST7285',
    description:
      'The World Wide Web (WWW) has become an integrated part of everyday life. Students develop basic skills of web programming, website design and development.',
  },
  {
    image: '../images/course11.jpeg',
    title: 'Technical Communication for Engineering Technologies',
    level: 'Level2',
    levelNumber: 2,
    code: 'ENL7019',
    description:
      'The ability to communicate effectively in a technically-oriented interdisciplinary workplace is a foundational skill in an innovation-driven economy. Students are introduced to the interpersonal skills and technical communication essentials, including report writing and presentation skills, required to thrive in workplace environments.',
  },
  {
    image: '../images/course12.jpeg',
    title: 'Cooperative Education and Job Readiness',
    level: 'Level2',
    levelNumber: 2,
    code: 'GEP1001',
    description:
      'Students are guided through a series of activities that prepare them to conduct a professional job search and succeed in the workplace. Through class discussions, assignments and workshops, students research occupations in their field of study, identify their own strengths, and develop a job search strategy.',
  },
  {
    image: '../images/course13.jpeg',
    title: 'Systems Analysis and Design',
    level: 'Level3',
    levelNumber: 3,
    code: 'CST7334',
    description:
      'Complex information technology systems require extensive planning and design. Guided by industry standard software engineering methodologies.',
  },
  {
    image: '../images/course14.jpeg',
    title: 'Mobile Graphical Interface Programming',
    level: 'Level3',
    levelNumber: 3,
    code: 'CST2335',
    description:
      'Mobile devices play an instrumental part of everyday life, thus requiring knowledge of mobile graphical user interface development.',
  },
  {
    image: '../images/course15.jpeg',
    title: 'Network Programming',
    level: 'Level3',
    levelNumber: 3,
    code: 'CST8109',
    description:
      "Software programming in today's environment requires detailed knowledge of the underlying network topology, its implementation and programming support structures.",
  },
  {
    image: '../images/course16.jpeg',
    title: 'Object Oriented Programming with Design Patterns',
    level: 'Level3',
    levelNumber: 3,
    code: 'CST7288',
    description:
      'Design patterns are programming architecture solutions to common challenges faced in software implementation. Students implement best practices for object-oriented program design and testing.',
  },
  {
    image: '../images/course17.jpeg',
    title: 'Business Programming',
    level: 'Level3',
    levelNumber: 3,
    code: 'CST7283',
    description:
      'Information systems built using the COBOL programming language support important institutions such as government services and the banking sector.',
  },
  {
    image: '../images/course18.jpeg',
    title: 'Business Intelligence and Data Analytics',
    level: 'Level3',
    levelNumber: 3,
    code: 'CST7390',
    description:
      'Business Intelligence (BI) can be broadly defined as a set of applications, infrastructure, and best practices that integrate and transform data into information for decision making.',
  },
  {
    image: '../images/course19.jpeg',
    title: 'Advanced Database Topics',
    level: 'Level4',
    levelNumber: 4,
    code: 'CST7276',
    description:
      'Database administration is an important role, in particular for deployed information technology systems. Teams and individuals explore advanced topics.',
  },
  {
    image: '../images/course20.jpeg',
    title: 'Enterprise Application Programming',
    level: 'Level4',
    levelNumber: 4,
    code: 'CST7277',
    description:
      'Enterprise applications connect clients to services that are based on data stored in database management systems. With a focus on the IT Enterprise.',
  },
  {
    image: '../images/course21.jpeg',
    title: 'Software Development Project',
    level: 'Level4',
    levelNumber: 4,
    code: 'CST7337',
    description:
      'Industry recognizes the value of graduates possessing real-world software development experience. Following the agile software engineering methodology, students work as part of a team to develop solutions to complex software application problems within an enterprise environment.',
  },
  {
    image: '../images/course22.jpeg',
    title: 'Programming Language Research Project',
    level: 'Level4',
    levelNumber: 4,
    code: 'CST7333',
    description:
      'Learning a new programming language or framework on your own is a challenge faced by programmers on the job as part of their career. Students learn how to identify new programming languages and frameworks to adapt to the evolving environment of technology.',
  },
];

let searchedCourses = courses; // Initial search includes all courses
let filteredCourses = searchedCourses; // Initial filter includes all searched courses

window.onload = function() {
  displayCourses(courses);
};

function displayCourses(courseArray) {
  var courseList = document.getElementById('courseList');
  courseList.innerHTML = ''; // clear the course list first
  if (courseArray.length === 0) {
    document.getElementById('resultInfo').style.display = 'flex';
    document.getElementById('resetButton').style.display = 'inline-block'; // show reset button
  } else {
    document.getElementById('resultInfo').style.display = 'none';
    for (var i = 0; i < courseArray.length; i++) {
      courseList.innerHTML += `
        <div class="course">
          <img src="${courseArray[i].image}" alt="Course image"/>
          <h4>${courseArray[i].title}</h4>
          <p>Level: ${courseArray[i].level}</p>
          <p>Course Code: ${courseArray[i].code}</p>
          <p>${courseArray[i].description}</p>
        </div>
      `;
    }
  }
}





function resetSearch() {
  document.getElementById('searchBar').value = '';
  document.getElementById('resetButton').style.display = 'none'; // hide reset button
  searchedCourses = courses; // Reset to all courses
  filteredCourses = searchedCourses; // Reset filter to all searched courses
  sortCourses('asc'); // Default sort to ascending
  displayCourses(searchedCourses); // added this line
}



function searchCourse() {
  var input = document.getElementById('searchBar').value.toLowerCase();
  searchedCourses = courses.filter((course) =>
    course.title.toLowerCase().includes(input)
  );
  document.getElementById('filterLevel').value = 'all'; // Reset filter
  filteredCourses = searchedCourses; // Set filtered courses to searched courses
  sortCourses('asc'); // Default sort to ascending
}



function filterCourses() {
  var level = document.getElementById('filterLevel').value;
  filteredCourses =
    level === 'all'
      ? searchedCourses
      : searchedCourses.filter((course) => course.level === level);
  sortCourses('asc'); // Default sort to ascending
}


function sortCourses(direction) {
  var sortedCourses = [...filteredCourses].sort((a, b) => {
    return direction === 'asc'
      ? a.levelNumber - b.levelNumber
      : b.levelNumber - a.levelNumber;
  });

  // toggle the selected class on the buttons
  var sortAscButton = document.getElementById('sortAscButton');
  var sortDescButton = document.getElementById('sortDescButton');
  if (direction === 'asc') {
    sortAscButton.classList.add('selected');
    sortDescButton.classList.remove('selected');
  } else {
    sortAscButton.classList.remove('selected');
    sortDescButton.classList.add('selected');
  }

  displayCourses(sortedCourses);
}
