package polling;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HeeButtonServlet", urlPatterns = { "/HeeButton" })
public class HeeButtonServlet extends HttpServlet {
	// countUpされる値
	int count;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		System.out.println("get");
		resp.setContentType("application/json");
		resp.getWriter().write("{\"count\":\"" + count + "\"}");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("post");
		count++;
	}

	@Override
	public void init() throws ServletException {
		super.init();

		/*
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				count++;
			}
		};
		timer.schedule(task, 3000, 3000);
		*/
	}
}