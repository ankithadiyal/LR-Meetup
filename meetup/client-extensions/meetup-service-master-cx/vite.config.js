import { defineConfig } from 'vite'
import react from '@vitejs/plugin-react'

// https://vitejs.dev/config/
export default defineConfig({
	base: '/o/meetup-service-master-cx',
	plugins: [react({
		jsxRuntime: 'classic',
	})],
	build: {
		outDir: './vite-build',
		rollupOptions: {
			external: [
				'react',
				'react-dom',
				/^@clayui.*$/,
			],
		}
	}
})
