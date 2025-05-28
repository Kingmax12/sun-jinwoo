let level = 1;
    let xp = 0;
    let tasksCompleted = 0;

    function completeTask() {
      const taskName = document.getElementById('taskName').value.trim();
      const xpInput = document.getElementById('xpReward').value;
      const xpReward = parseInt(xpInput);

      if (!taskName || isNaN(xpReward)) {
        alert("Please enter a valid task name and XP reward.");
        return;
      }

      tasksCompleted++;
      xp += xpReward;

      while (xp >= level * 100) {
        xp -= level * 100;
        level++;
        logMessage(`🔺 Level Up! You are now Level ${level}!`);
      }

      updateAssessment();
      logMessage(`✅ Task '${taskName}' completed! 🎉`);
    }

    function updateAssessment() {
      document.getElementById('assessment').innerHTML = `
        <h2>📈 Current Assessment</h2>
        <p>Level: ${level}</p>
        <p>XP: ${xp}</p>
        <p>Tasks Completed: ${tasksCompleted}</p>
      `;
    }

    function logMessage(message) {
      const log = document.getElementById('log');
      const entry = document.createElement('div');
      entry.textContent = message;
      log.prepend(entry);
    }