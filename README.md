# Shubham Ambre - Java Backend Developer Portfolio

A modern, dark-themed portfolio website built with Spring Boot, showcasing my Java backend development skills and projects.

## 🚀 Live Demo

The portfolio is now running at: `http://localhost:8080`

## ✨ Features

### **Modern Dark Design**
- **Dark Theme**: Professional dark background with blue/cyan accent colors
- **Responsive Layout**: Fully responsive design that works on all devices
- **Smooth Animations**: Fade-in animations and smooth scrolling effects
- **Modern Typography**: Clean Inter font for excellent readability

### **Interactive Elements**
- **Fixed Navigation**: Sticky navbar with smooth scroll navigation
- **Active Section Highlighting**: Navigation updates based on current section
- **Hover Effects**: Cards lift and glow on hover
- **Skill Bars**: Animated skill progress bars
- **Contact Form**: Functional contact form with validation

### **Professional Sections**
- **Hero Section**: Eye-catching introduction with animated background
- **About Section**: Personal introduction with statistics
- **Projects Section**: Showcase of 5 major projects with tech stacks
- **Skills Section**: Technical skills with progress bars
- **Contact Section**: Contact information and form

## 🛠️ Technology Stack

### **Backend**
- **Spring Boot 3.0.4**: Modern Java framework
- **Thymeleaf**: Server-side templating
- **Maven**: Dependency management

### **Frontend**
- **HTML5**: Semantic markup
- **CSS3**: Modern styling with CSS Variables
- **JavaScript**: Interactive functionality
- **Font Awesome**: Icons and visual elements
- **Google Fonts**: Inter typography

### **Design Features**
- **CSS Grid & Flexbox**: Modern layout techniques
- **CSS Variables**: Consistent theming
- **Responsive Design**: Mobile-first approach
- **Smooth Animations**: CSS transitions and keyframes

## 📁 Project Structure

```
portfolio/
├── src/main/java/com/portfolio/portfolio/
│   ├── PortfolioApplication.java
│   └── PortfolioController.java
├── src/main/resources/
│   ├── static/css/style.css
│   ├── templates/index.html
│   └── application.properties
├── pom.xml
└── README.md
```

## 🎨 Design Highlights

### **Color Scheme**
- **Primary**: Dark backgrounds (#0a0a0a, #111111, #1a1a1a)
- **Accent**: Blue gradient (#3b82f6 to #06b6d4)
- **Text**: White primary, gray secondary (#a1a1aa, #71717a)

### **Typography**
- **Font Family**: Inter (300, 400, 500, 600, 700, 800)
- **Hierarchy**: Clear heading structure
- **Readability**: Optimized line heights and spacing

### **Components**
- **Navigation**: Fixed header with smooth scrolling
- **Cards**: Elevated project cards with hover effects
- **Buttons**: Gradient primary buttons, outlined secondary
- **Forms**: Styled input fields with focus states
- **Progress Bars**: Animated skill indicators

## 🚀 Getting Started

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd portfolio
   ```

2. **Run with Maven**
   ```bash
   mvn spring-boot:run
   ```

3. **Open in browser**
   ```
   http://localhost:8080
   ```

## 📱 Responsive Breakpoints

- **Desktop**: > 1024px
- **Tablet**: 768px - 1024px
- **Mobile**: < 768px
- **Small Mobile**: < 480px

## 🎯 Sections Overview

### **Hero Section**
- Large heading with gradient text
- Subtitle and call-to-action buttons
- Animated background with floating elements
- Circular avatar with pulsing animation

### **About Section**
- Personal introduction
- Statistics cards (projects, experience, technologies, dedication)
- Two-column layout on desktop

### **Projects Section**
- 5 project cards in responsive grid
- Each card includes:
  - Project icon
  - Title and description
  - Technology tags
  - Demo and source code links

### **Skills Section**
- 3 skill categories: Backend, Databases, Frontend & Tools
- Animated progress bars
- Percentage indicators

### **Contact Section**
- Contact information with icons
- Contact form with validation
- Social media links

## 🔧 Customization

### **Colors**
Edit CSS variables in `:root` to change the theme:
```css
--bg-primary: #0a0a0a;
--accent-primary: #3b82f6;
--text-primary: #ffffff;
```

### **Content**
Update the Thymeleaf template `index.html` to modify:
- Personal information
- Project details
- Skills and percentages
- Contact information

### **Styling**
Modify `style.css` to customize:
- Layout and spacing
- Animations and transitions
- Responsive breakpoints

## 📈 Performance Features

- **Optimized CSS**: Minimal, efficient stylesheets
- **Fast Loading**: Lightweight design
- **Smooth Scrolling**: Native CSS smooth-scroll
- **Lazy Animations**: Intersection Observer for performance

## 🤝 Contributing

Feel free to fork this project and customize it for your own portfolio. The design is built to be easily modifiable and extensible.

## 📄 License

This project is open source and available under the MIT License.

---

**Built with ❤️ using Spring Boot and modern web technologies**