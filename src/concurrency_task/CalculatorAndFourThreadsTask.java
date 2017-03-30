package concurrency_task;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.stream.Stream;

import task_from_teacher_14.ConsoleUserInterface;
import task_from_teacher_14.SimpleCalculatorService;

/**
 * Class for practice in Concurrency.
 * 
 * @author Yakov Medvedev
 *
 */
public class CalculatorAndFourThreadsTask {
	
	private static File _file = new File("expressionsFileResults.txt");
	private static Path _path = Paths.get("expressionsFile.txt");
	private static Stream<String> _streamFromFiles;
	private static List<String> _listInputData = new ArrayList<>();
	private static List<String> _results = new ArrayList<>();
	
	public CalculatorAndFourThreadsTask() {}
	
	public static File getFile() {
		return _file;
	}

	public static void setFile(File file) {
		CalculatorAndFourThreadsTask._file = file;
	}

	public Path getPath() {
		return _path;
	}

	public void setPath(Path path) {
		_path = path;
	}
	
	/**
	 * Reads string lines from text file and saves them in ArrayList.
	 * 
	 * @param path path to Readable file
	 * @throws IOException
	 */
	public static void readFromFile(Path path) throws IOException {
		_path = path;
		_streamFromFiles = Files.lines(path);
		_streamFromFiles.forEach(i -> _listInputData.add(i));
	}
	
	/**
	 * Class for running a Thread.
	 * 
	 * @author Yakov Medvedev
	 *
	 */
	private static class ThreadRunner implements Runnable {
		private int _startCount;
		private int _endCount;
		
		public ThreadRunner(int startCount, int endCount) {
			super();
			_startCount = startCount;
			_endCount = endCount;
		}

		@Override
		public void run() {
			ConsoleUserInterfaceThreads consoleUserInterfaceThreads = 
					new ConsoleUserInterfaceThreads(_startCount,_endCount);
			try {
				consoleUserInterfaceThreads.start();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * Class for calculation arithmetic expressions from 
	 * task_from_teacher_14 converted for reading input data from text file.
	 * 
	 * @author Yakov Medvedev
	 *
	 */
	private static class ConsoleUserInterfaceThreads extends ConsoleUserInterface{
		private int _startCount;
		private int _endCount;
		
		public ConsoleUserInterfaceThreads(int startCount, int endCount) {
			super();
			_startCount = startCount;
			_endCount = endCount;
		}
		
		@Override
		public void start() throws Exception {
			try {
				for (int i = _startCount; i <= _endCount; i++) {
					ConsoleUserInterface cui = new ConsoleUserInterface();
					SimpleCalculatorService scs = new SimpleCalculatorService();
					cui.setUserExpression(_listInputData.get(i));
					cui.parseUserInput(_listInputData.get(i));
					scs.evaluate(cui.getNumsAndOprs());
					BufferedWriter writer = new BufferedWriter(new FileWriter(_file, true));
					String result = Double.toString(scs.getResult());
					String threadName = Thread.currentThread().getName();
					System.out.println(threadName + "   " + result);
					writer.write(threadName + "   " + _listInputData.get(i) + "   result: " + result + "\n");
					writer.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public static void main(String[] args) throws Exception {
		readFromFile(_path);
		
		Thread one = new Thread (new ThreadRunner(0,250));
		Thread two = new Thread (new ThreadRunner(250,500));
		Thread three = new Thread (new ThreadRunner(500,750));
		Thread four = new Thread (new ThreadRunner(750,1000));
		
		one.setName("Thread One");
		two.setName("Thread Two");
		three.setName("Thread Three");
		four.setName("Thread Four");
		
		System.out.println("Start !");
		
		Executor executor = Executors.newFixedThreadPool(4);;
		executor.execute(one);
		executor.execute(two);
		executor.execute(three);
		executor.execute(four);
		
		System.out.println("Finish !");
	}
}

