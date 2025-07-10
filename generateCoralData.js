const fs = require('fs');

// Helper function to calculate HpEV and efficiency
function calculateHpEV(pointValue, successRate) {
    return pointValue * successRate;
}

function calculateEfficiency(hpEV, cycleTime) {
    return hpEV / cycleTime;
}

// Define the base data structure (level, face, and pointValue)
const data = [
    { name: "Coral (L1) A", level: 1, face: "A", pointValue: 2, successRate: 1.0, cycleTimeFromLeftHP: 2.19, cycleTimeFromRightHP: 2.19 },
    { name: "Coral (L2) A", level: 2, face: "A", pointValue: 3, successRate: 1.0, cycleTimeFromLeftHP: 2.19 + 0.25, cycleTimeFromRightHP: 2.19 + 0.25 },
    { name: "Coral (L3) A", level: 3, face: "A", pointValue: 4, successRate: 1.0, cycleTimeFromLeftHP: 2.19 + 0.5, cycleTimeFromRightHP: 2.19 + 0.5 },
    { name: "Coral (L4) A", level: 4, face: "A", pointValue: 5, successRate: 1.0, cycleTimeFromLeftHP: 2.19 + 0.75, cycleTimeFromRightHP: 2.19 + 0.75 },

    { name: "Coral (L1) B", level: 1, face: "B", pointValue: 2, successRate: 1.0, cycleTimeFromLeftHP: 2.5, cycleTimeFromRightHP: 2 },
    { name: "Coral (L2) B", level: 2, face: "B", pointValue: 3, successRate: 1.0, cycleTimeFromLeftHP: 2.5 + 0.25, cycleTimeFromRightHP: 2 + 0.25 },
    { name: "Coral (L3) B", level: 3, face: "B", pointValue: 4, successRate: 1.0, cycleTimeFromLeftHP: 2.5 + 0.5, cycleTimeFromRightHP: 2 + 0.5 },
    { name: "Coral (L4) B", level: 4, face: "B", pointValue: 5, successRate: 1.0, cycleTimeFromLeftHP: 2.5 + 0.75, cycleTimeFromRightHP: 2 + 0.75 },

    { name: "Coral (L1) C", level: 1, face: "C", pointValue: 2, successRate: 1.0, cycleTimeFromLeftHP: 3.58, cycleTimeFromRightHP: 2.55 },
    { name: "Coral (L2) C", level: 2, face: "C", pointValue: 3, successRate: 1.0, cycleTimeFromLeftHP: 3.58 + 0.25, cycleTimeFromRightHP: 2.55 + 0.25 },
    { name: "Coral (L3) C", level: 3, face: "C", pointValue: 4, successRate: 1.0, cycleTimeFromLeftHP: 3.58 + 0.5, cycleTimeFromRightHP: 2.55 + 0.5 },
    { name: "Coral (L4) C", level: 4, face: "C", pointValue: 5, successRate: 1.0, cycleTimeFromLeftHP: 3.58 + 0.75, cycleTimeFromRightHP: 2.55 + 0.75 },

    { name: "Coral (L1) D", level: 1, face: "D", pointValue: 2, successRate: 1.0, cycleTimeFromLeftHP: 3.23, cycleTimeFromRightHP: 3.23 },
    { name: "Coral (L2) D", level: 2, face: "D", pointValue: 3, successRate: 1.0, cycleTimeFromLeftHP: 3.23 + 0.25, cycleTimeFromRightHP: 3.23 + 0.25 },
    { name: "Coral (L3) D", level: 3, face: "D", pointValue: 4, successRate: 1.0, cycleTimeFromLeftHP: 3.23 + 0.5, cycleTimeFromRightHP: 3.23 + 0.5 },
    { name: "Coral (L4) D", level: 4, face: "D", pointValue: 5, successRate: 1.0, cycleTimeFromLeftHP: 3.23 + 0.75, cycleTimeFromRightHP: 3.23 + 0.75 },

    { name: "Coral (L1) E", level: 1, face: "E", pointValue: 2, successRate: 1.0, cycleTimeFromLeftHP: 2.55, cycleTimeFromRightHP: 3.58 },
    { name: "Coral (L2) E", level: 2, face: "E", pointValue: 3, successRate: 1.0, cycleTimeFromLeftHP: 2.55 + 0.25, cycleTimeFromRightHP: 3.58 + 0.25 },
    { name: "Coral (L3) E", level: 3, face: "E", pointValue: 4, successRate: 1.0, cycleTimeFromLeftHP: 2.55 + 0.5, cycleTimeFromRightHP: 3.58 + 0.5 },
    { name: "Coral (L4) E", level: 4, face: "E", pointValue: 5, successRate: 1.0, cycleTimeFromLeftHP: 2.55 + 0.75, cycleTimeFromRightHP: 3.58 + 0.75 },

    { name: "Coral (L1) F", level: 1, face: "F", pointValue: 2, successRate: 1.0, cycleTimeFromLeftHP: 2, cycleTimeFromRightHP: 2.5 },
    { name: "Coral (L2) F", level: 2, face: "F", pointValue: 3, successRate: 1.0, cycleTimeFromLeftHP: 2 + 0.25, cycleTimeFromRightHP: 2.5 + 0.25 },
    { name: "Coral (L3) F", level: 3, face: "F", pointValue: 4, successRate: 1.0, cycleTimeFromLeftHP: 2 + 0.5, cycleTimeFromRightHP: 2.5 + 0.5 },
    { name: "Coral (L4) F", level: 4, face: "F", pointValue: 5, successRate: 1.0, cycleTimeFromLeftHP: 2 + 0.75, cycleTimeFromRightHP: 2.5 + 0.75 }
];

// Process each entry to add HpEV and efficiency
const processedData = data.map(entry => {
    const leftHpEV = calculateHpEV(entry.pointValue, entry.successRate);
    const rightHpEV = leftHpEV; // Assuming the same for both sides (left and right HP)
    const leftHpEfficiency = calculateEfficiency(leftHpEV, entry.cycleTimeFromLeftHP);
    const rightHpEfficiency = calculateEfficiency(rightHpEV, entry.cycleTimeFromRightHP);

    return {
        ...entry,
        leftHpEV,
        rightHpEV,
        leftHpEfficiency,
        rightHpEfficiency
    };
});

// Output the processed data to a JSON file
fs.writeFileSync('coralData.json', JSON.stringify(processedData, null, 2));

console.log('Data has been written to coralData.json');
